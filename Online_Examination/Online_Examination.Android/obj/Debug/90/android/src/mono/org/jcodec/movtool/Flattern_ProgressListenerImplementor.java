package mono.org.jcodec.movtool;


public class Flattern_ProgressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		org.jcodec.movtool.Flattern.ProgressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_trigger:(I)V:GetTrigger_IHandler:Org.Jcodec.Movtool.Flattern/IProgressListenerInvoker, InstabugAndroidCoreSDK\n" +
			"";
		mono.android.Runtime.register ("Org.Jcodec.Movtool.Flattern+IProgressListenerImplementor, InstabugAndroidCoreSDK", Flattern_ProgressListenerImplementor.class, __md_methods);
	}


	public Flattern_ProgressListenerImplementor ()
	{
		super ();
		if (getClass () == Flattern_ProgressListenerImplementor.class)
			mono.android.TypeManager.Activate ("Org.Jcodec.Movtool.Flattern+IProgressListenerImplementor, InstabugAndroidCoreSDK", "", this, new java.lang.Object[] {  });
	}


	public void trigger (int p0)
	{
		n_trigger (p0);
	}

	private native void n_trigger (int p0);

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
