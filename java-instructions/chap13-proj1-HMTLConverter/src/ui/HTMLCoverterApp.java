/* Chap 13 - Project 1
 * Application that reads an HTML file and converts it to plain text
 */

package ui;

public class HTMLCoverterApp {

	public static void main(String[] args) {

		System.out.println("HTML Converter\n");
		
		System.out.println("INPUT");
		
		String html = 	"<h1>Grocery List</h1>\n" +
					  	"<ul>\n" +
					  	"	<li>Eggs</li>\n" +
					  	"	<li>Milk</li>\n" +
					  	"	<li>Butter</li>\n" +
					  	"</ul>";

		System.out.println(html);
		
		System.out.println("\nOUTPUT");
		
		html = html.replace("<li>", "* ");
		html = html.replaceAll("<[^>]+>", "");	
		
		System.out.println(html);
		
	}

}
