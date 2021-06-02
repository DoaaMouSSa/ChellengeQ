package mono.com.instabug.library;


public class FragmentVisibilityChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.instabug.library.FragmentVisibilityChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onVisibilityChanged:(Z)V:GetOnVisibilityChanged_ZHandler:Com.Instabug.Library.IFragmentVisibilityChangedListenerInvoker, InstabugAndroidCoreSDK\n" +
			"";
		mono.android.Runtime.register ("Com.Instabug.Library.IFragmentVisibilityChangedListenerImplementor, InstabugAndroidCoreSDK", FragmentVisibilityChangedListenerImplementor.class, __md_methods);
	}


	public FragmentVisibilityChangedListenerImplementor ()
	{
		super ();
		if (getClass () == FragmentVisibilityChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Instabug.Library.IFragmentVisibilityChangedListenerImplementor, InstabugAndroidCoreSDK", "", this, new java.lang.Object[] {  });
	}


	public void onVisibilityChanged (boolean p0)
	{
		n_onVisibilityChanged (p0);
	}

	private native void n_onVisibilityChanged (boolean p0);

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
