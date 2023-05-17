# Spring Security JWT Authentication

### Plot
![alt text](./assets/secone.png)

### Security Filter Chain

Spring Security Filter Chain is a crucial component of the Spring Security framework, which provides authentication and authorization features for Java applications. It is responsible for processing incoming HTTP requests, applying security measures, and managing access control.

The Spring Security Filter Chain consists of a series of filters that are applied in a specific order to incoming requests. Each filter performs a specific security-related task, such as authentication, authorization, session management, CSRF protection, etc. These filters work together to enforce security policies and protect the application from unauthorized access.

When a request reaches the Spring Security Filter Chain, the filters are executed in the defined order. Each filter can perform its designated task and can also decide whether to pass the request to the next filter in the chain or abort the chain's execution.

The default Spring Security Filter Chain typically includes the following filters:

1. **SecurityContextPersistenceFilter**: This filter ensures that the SecurityContext, which holds the user's authentication information, is properly stored and retrieved across multiple requests.
2. **LogoutFilter**: Handles user logout functionality and invalidates the user's session.
3. **UsernamePasswordAuthenticationFilter**: Performs user authentication using username and password credentials.
4. **DefaultLoginPageGeneratingFilter**: Generates a default login page if the user is not authenticated.
5. **DefaultLogoutPageGeneratingFilter**: Generates a default logout page.
6. **AuthenticationFilter**: Handles authentication requests for various authentication mechanisms, such as OAuth, OpenID, etc.
7. **AuthorizationFilter**: Handles authorization-related tasks, such as checking user roles and permissions.
8. **ExceptionTranslationFilter**: Handles exceptions that occur during the authentication and authorization process and translates them into appropriate responses.
9. **FilterSecurityInterceptor**: Enforces access control rules by intercepting requests and deciding whether to grant or deny access based on the configured security rules.

These are just a few examples, and the actual filter chain can vary depending on the specific configuration of your application. Additionally, you can customize the filter chain by adding or removing filters according to your application's requirements.

By configuring and customizing the Spring Security Filter Chain, you can control how requests are processed and secured in your application, enabling you to implement various security features and mechanisms to protect your application's resources.