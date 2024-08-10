# Leishmaniapp Analysis Tools for the JVM
This repository provides the tools needed for creating Leishmaniapp compatible dynamically-loaded analysis modules

## 🧩 Local Analysis Model (LAM)
LAM is an interface _(com.leishmaniapp.analysis.lam.**ILocalAnalysisModel**)_ for defining local (non-cloud) analysis classes that can be dynamically loaded into the JVM or implemented within an Android application

### Android LAM
Implementing a LAM in Android requires creating an application with the following requirements:

* The package name must be '_com.leishmaniapp.lam.*<disease>*_' where _<disease>_ is the disease/model ID (ej. leishmaniasis.giemsa)
* Must not contain any activities
* Contains a [*Bound Service*](https://developer.android.com/develop/background-work/services/bound-services) which is the class responsible for the analysis requests and replies and interacts with the concrete _com.leishmaniapp.analysis.lam.**ILocalAnalysisModel**_ implementation
* The service must be **exported** and contain the '_com.leishmaniapp.lam.ACTION_ANALYZE_' action
* The service must require '_com.leishmaniapp.lam.BIND_PERMISSION_' permission
* Both [**Leishmaniapp**](https://github.com/leishmaniapp/leishmaniapp-android) and the LAM module must be signed using the same developer signature

This is an XML example of the AndroidManifest.xml definition of the service
```xml
<service
	android:name="com.leishmaniapp.lam.foobar.MyBoundService"
	android:exported="true"
	android:permission="com.leishmaniapp.lam.BIND_PERMISSION">

	<intent-filter>
		<action android:name="com.leishmaniapp.lam.ACTION_ANALYZE" />
	</intent-filter>
</service>
```