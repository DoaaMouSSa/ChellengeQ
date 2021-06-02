package mono.com.instabug.library.core;


public class InitialScreenshotHelper_InitialScreenshotCapturingListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.instabug.library.core.InitialScreenshotHelper.InitialScreenshotCapturingListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScreenshotCapturedSuccessfully:(Landroid/net/Uri;)V:GetOnScreenshotCapturedSuccessfully_Landroid_net_Uri_Handler:Com.Instabug.Library.Core.InitialScreenshotHelper/IInitialScreenshotCapturingListenerInvoker, InstabugAndroidCoreSDK\n" +
			"n_onScreenshotCapturingFailed:(Ljava/lang/Throwable;)V:GetOnScreenshotCapturingFailed_Ljava_lang_Throwable_Handler:Com.Instabug.Library.Core.InitialScreenshotHelper/IInitialScreenshotCapturingListenerInvoker, InstabugAndroidCoreSDK\n" +
			"";
		mono.android.Runtime.register ("Com.Instabug.Library.Core.InitialScreenshotHelper+IInitialScreenshotCapturingListenerImplementor, InstabugAndroidCoreSDK", InitialScreenshotHelper_InitialScreenshotCapturingListenerImplementor.class, __md_methods);
	}


	public InitialScreenshotHelper_InitialScreenshotCapturingListenerImplementor ()
	{
		super ();
		if (getClass () == InitialScreenshotHelper_InitialScreenshotCapturingListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Instabug.Library.Core.InitialScreenshotHelper+IInitialScreenshotCapturingListenerImplementor, InstabugAndroidCoreSDK", "", this, new java.lang.Object[] {  });
	}


	public void onScreenshotCapturedSuccessfully (android.net.Uri p0)
	{
		n_onScreenshotCapturedSuccessfully (p0);
	}

	private native void n_onScreenshotCapturedSuccessfully (android.net.Uri p0);


	public void onScreenshotCapturingFailed (java.lang.Throwable p0)
	{
		n_onScreenshotCapturingFailed (p0);
	}

	private native void n_onScreenshotCapturingFailed (java.lang.Throwable p0);

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
