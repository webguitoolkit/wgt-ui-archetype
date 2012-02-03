#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.page;

import org.webguitoolkit.ui.controls.Page;

public class Index extends Page{
	
	protected void pageInit() {
		addHeaderCSS("./wgt-resources/standard_theme.css");
		
		// TODO: write your code here
		getFactory().createLabel(this, "Hello ${artifactId}");
	}

	protected String title() {
		return "${artifactId}";
	}
}