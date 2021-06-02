package mono.com.instabug.library.ui.custom;


public class InstabugScrollView_OnScrollListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.instabug.library.ui.custom.InstabugScrollView.OnScrollListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBottomReached:()V:GetOnBottomReachedHandler:Com.Instabug.Library.UI.Custom.InstabugScrollView/IOnScrollListenerInvoker, InstabugAndroidCoreSDK\n" +
			"n_onScrolling:()V:GetOnScrollingHandler:Com.Instabug.Library.UI.Custom.InstabugScrollView/IOnScrollListenerInvoker, InstabugAndroidCoreSDK\n" +
			"n_onTopReached:()V:GetOnTopReachedHandler:Com.Instabug.Library.UI.Custom.InstabugScrollView/IOnScrollListenerInvoker, InstabugAndroidCoreSDK\n" +
			"";
		mono.android.Runtime.register ("Com.Instabug.Library.UI.Custom.InstabugScrollView+IOnScrollListenerImplementor, InstabugAndroidCoreSDK", InstabugScrollView_OnScrollListenerImplementor.class, __md_methods);
	}


	public InstabugScrollView_OnScrollListenerImplementor ()
	{
		super ();
		if (getClass () == InstabugScrollView_OnScrollListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Instabug.Library.UI.Custom.InstabugScrollView+IOnScrollListenerImplementor, InstabugAndroidCoreSDK", "", this, new java.lang.Object[] {  });
	}


	public void onBottomReached ()
	{
		n_onBottomReached ();
	}

	private native void n_onBottomReached ();


	public void onScrolling ()
	{
		n_onScrolling ();
	}

	private native void n_onScrolling ();


	public void onTopReached ()
	{
		n_onTopReached ();
	}

	private native void n_onTopReached ();

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
