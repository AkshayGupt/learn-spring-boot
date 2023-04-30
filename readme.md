> Topics to remember
1. Dev-tools
2. Actuator
3. IOC
4. Dependency Injection
5. Autowiring
6. Qualifiers
7. Beans - is it necessary to add **@Component** to that class to be called as Bean
8. Constructor Injection
9. Setter Injection 
10. Field Injection (Not preferred anymore, difficult to write test cases for)
11. Bean scopes
     1. singleton
     2. prototype
     3. request
     4. session
     5. global-session
12. Lazy initialization

--- 

> Annotations

1. @EnableAutoConfiguration
2. @ComponentScan
3. @Configuration
4. @SpringbootApplication
5. @Component
6. @Autowire
7. @Qualifier ( has higher priority than Primary)
8. @Primary
9. @PostConstruct
10. @PreDestroy
11. @Bean
     - helps use 3rd party classes. 
     - for eg. AWS S3 class
     - can't edit the source code and add **@Component**
     - so, make a class with **@Configuration** and create a function with @Bean annotation inside which manually create AWS S3 object and address the configs as per requirement.
     - return the S3 object from that function
     - Now, Use the functionName as a Bean class and do Constructor Injection/ Setter Injection, etc.
12. @Configurable ?


