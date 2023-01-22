## conclusion

>clean code , easy to read , abstraction

##dependency

```xml
<dependencies>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.11</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.inject</groupId>
			<artifactId>jersey-hk2</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.containers</groupId>
			<artifactId>jersey-container-servlet</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.core</groupId>
			<artifactId>jersey-server</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.core</groupId>
			<artifactId>jersey-common</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish</groupId>
			<artifactId>jakarta.json</artifactId>
			<version>2.0.1</version>
		</dependency>
	</dependencies>
```

## boot class

```java
package com.lavesh.init;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class AppBoot extends Application {

}

```

## locator logic

```java
package com.lavesh.init;

import java.util.UUID;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/test")
public class Test {

	@Path("/{location}/path")
	public Object get(@PathParam("location") String location) {

		if (location.equals("abc")) {
			return new Abc();
		} else if (location.equals("pqr")) {

			return new Pqr();
		} else {

			return new Unkown();
		}
	}
}

```

## sub classes 1

```java
package com.lavesh.init;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class Abc {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/start")
	public String gwt() {
		return "ABC";
	}
}

```

## sub class 2

```java 
package com.lavesh.init;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class Pqr {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/start")
	public String get() {

		return "PQR";
	}
}

```


## sub class 3

```java
package com.lavesh.init;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class Unkown {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/start")
	public String get() {
		return "unknown";
	}
}


```