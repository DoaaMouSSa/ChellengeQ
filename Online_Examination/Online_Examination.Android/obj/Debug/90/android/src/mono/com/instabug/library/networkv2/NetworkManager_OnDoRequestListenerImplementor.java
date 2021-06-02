package mono.com.instabug.library.networkv2;


public class NetworkManager_OnDoRequestListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.instabug.library.networkv2.NetworkManager.OnDoRequestListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onComplete:()V:GetOnCompleteHandler:Com.Instabug.Library.Networkv2.NetworkManager/IOnDoRequestListenerInvoker, InstabugAndroidCoreSDK\n" +
			"n_onRequestStarted:(Lcom/instabug/library/networkv2/request/Request;)V:GetOnRequestStarted_Lcom_instabug_library_networkv2_request_Request_Handler:Com.Instabug.Library.Networkv2.NetworkManager/IOnDoRequestListenerInvoker, InstabugAndroidCoreSDK\n" +
			"n_onStart:()V:GetOnStartHandler:Com.Instabug.Library.Networkv2.NetworkManager/IOnDoRequestListenerInvoker, InstabugAndroidCoreSDK\n" +
			"";
		mono.android.Runtime.register ("Com.Instabug.Library.Networkv2.NetworkManager+IOnDoRequestListenerImplementor, InstabugAndroidCoreSDK", NetworkManager_OnDoRequestListenerImplementor.class, __md_methods);
	}


	public NetworkManager_OnDoRequestListenerImplementor ()
	{
		super ();
		if (getClass () == NetworkManager_OnDoRequestListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Instabug.Library.Networkv2.NetworkManager+IOnDoRequestListenerImplementor, InstabugAndroidCoreSDK", "", this, new java.lang.Object[] {  });
	}


	public void onComplete ()
	{
		n_onComplete ();
	}

	private native void n_onComplete ();


	public void onRequestStarted (com.instabug.library.networkv2.request.Request p0)
	{
		n_onRequestStarted (p0);
	}

	private native void n_onRequestStarted (com.instabug.library.networkv2.request.Request p0);


	public void onStart ()
	{
		n_onStart ();
	}

	private native void n_onStart ();

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
