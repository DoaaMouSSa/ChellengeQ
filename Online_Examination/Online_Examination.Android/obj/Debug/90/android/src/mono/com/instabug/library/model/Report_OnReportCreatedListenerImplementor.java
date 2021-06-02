package mono.com.instabug.library.model;


public class Report_OnReportCreatedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.instabug.library.model.Report.OnReportCreatedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReportCreated:(Lcom/instabug/library/model/Report;)V:GetOnReportCreated_Lcom_instabug_library_model_Report_Handler:Com.Instabug.Library.Model.Report/IOnReportCreatedListenerInvoker, InstabugAndroidCoreSDK\n" +
			"";
		mono.android.Runtime.register ("Com.Instabug.Library.Model.Report+IOnReportCreatedListenerImplementor, InstabugAndroidCoreSDK", Report_OnReportCreatedListenerImplementor.class, __md_methods);
	}


	public Report_OnReportCreatedListenerImplementor ()
	{
		super ();
		if (getClass () == Report_OnReportCreatedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Instabug.Library.Model.Report+IOnReportCreatedListenerImplementor, InstabugAndroidCoreSDK", "", this, new java.lang.Object[] {  });
	}


	public void onReportCreated (com.instabug.library.model.Report p0)
	{
		n_onReportCreated (p0);
	}

	private native void n_onReportCreated (com.instabug.library.model.Report p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
