package mono.com.instabug.library.internal.storage.cache.db;


public class InstabugDBInsertionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.instabug.library.internal.storage.cache.db.InstabugDBInsertionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDataInserted:(Ljava/lang/Object;)V:GetOnDataInserted_Ljava_lang_Object_Handler:Com.Instabug.Library.Internal.Storage.Cache.DB.IInstabugDBInsertionListenerInvoker, InstabugAndroidCoreSDK\n" +
			"";
		mono.android.Runtime.register ("Com.Instabug.Library.Internal.Storage.Cache.DB.IInstabugDBInsertionListenerImplementor, InstabugAndroidCoreSDK", InstabugDBInsertionListenerImplementor.class, __md_methods);
	}


	public InstabugDBInsertionListenerImplementor ()
	{
		super ();
		if (getClass () == InstabugDBInsertionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Instabug.Library.Internal.Storage.Cache.DB.IInstabugDBInsertionListenerImplementor, InstabugAndroidCoreSDK", "", this, new java.lang.Object[] {  });
	}


	public void onDataInserted (java.lang.Object p0)
	{
		n_onDataInserted (p0);
	}

	private native void n_onDataInserted (java.lang.Object p0);

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
