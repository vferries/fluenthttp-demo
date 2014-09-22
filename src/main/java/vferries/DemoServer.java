package vferries;

import java.util.Arrays;

import net.codestory.http.WebServer;

public class DemoServer {
	public static void main(String[] args) {
		new WebServer(routes -> routes.
				get("/hello/:who", (context, name) -> "Hello " + name + "!").
				get("/error", () -> 0 / 0).
				get("/persons", () -> Arrays.asList(new Person("Vincent FERRIES", 30), new Person("René Lataupe", 12)))
		).start();
	}
}
