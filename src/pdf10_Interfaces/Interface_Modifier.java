package pdf10_Interfaces;
/*
10. Create an interface with private, public and protected fields.
11. Create an interface with static final variable
 */
interface Interface_Modifier {
	
	private void getString_privatecData() ;
	public void getString_publicData();
	protected void getString_protectedData();
	final  void getString_finalData();
	static  void getString_staticData();

	/*
	 * Illegal modifier for the interface method getString_privatecData; only public, abstract, default, static and strictfp are permitted
	 */

}
