package com.meteor.springgraalvm;

import org.springframework.aop.framework.autoproxy.InfrastructureAdvisorAutoProxyCreator__BeanDefinitions;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages__BeanDefinitions;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.codec.CodecProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.context.LifecycleProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.jackson.JacksonProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.netty.NettyAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.netty.NettyProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.reactor.netty.ReactorNettyConfigurations__BeanDefinitions;
import org.springframework.boot.autoconfigure.reactor.netty.ReactorNettyProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.ssl.SslProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskExecutionProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskSchedulingProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.ServerProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.WebProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.reactive.ReactiveMultipartAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.reactive.ReactiveMultipartProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.reactive.WebSessionIdResolverAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.reactive.error.ErrorWebFluxAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.reactive.function.client.ClientHttpConnectorAutoConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.reactive.function.client.ClientHttpConnectorFactoryConfiguration__BeanDefinitions;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration__BeanDefinitions;
import org.springframework.boot.context.properties.BoundConfigurationProperties__BeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinder__BeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor__BeanDefinitions;
import org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer__BeanDefinitions;
import org.springframework.boot.validation.beanvalidation.MethodValidationExcludeFilter__BeanDefinitions;
import org.springframework.boot.web.server.WebServerFactoryCustomizerBeanPostProcessor__BeanDefinitions;
import org.springframework.context.event.DefaultEventListenerFactory__BeanDefinitions;
import org.springframework.context.event.EventListenerMethodProcessor__BeanDefinitions;
import org.springframework.web.reactive.config.WebFluxConfigurationSupport__BeanDefinitions;

/**
 * Register bean definitions for the bean factory.
 */
public class SpringGraalvmApplication__BeanFactoryRegistrations {
  /**
   * Register the bean definitions.
   */
  public void registerBeanDefinitions(DefaultListableBeanFactory beanFactory) {
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerProcessor", EventListenerMethodProcessor__BeanDefinitions.getInternalEventListenerProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerFactory", DefaultEventListenerFactory__BeanDefinitions.getInternalEventListenerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("springGraalvmApplication", SpringGraalvmApplication__BeanDefinitions.getSpringGraalvmApplicationBeanDefinition());
    beanFactory.registerBeanDefinition("helloController", HelloController__BeanDefinitions.getHelloControllerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.AutoConfigurationPackages", AutoConfigurationPackages__BeanDefinitions.BasePackages.getAutoConfigurationPackagesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration", PropertyPlaceholderAutoConfiguration__BeanDefinitions.getPropertyPlaceholderAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("propertySourcesPlaceholderConfigurer", PropertyPlaceholderAutoConfiguration__BeanDefinitions.getPropertySourcesPlaceholderConfigurerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.reactor.netty.ReactorNettyConfigurations$ReactorResourceFactoryConfiguration", ReactorNettyConfigurations__BeanDefinitions.ReactorResourceFactoryConfiguration.getReactorResourceFactoryConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("reactorResourceFactory", ReactorNettyConfigurations__BeanDefinitions.ReactorResourceFactoryConfiguration.getReactorResourceFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor", ConfigurationPropertiesBindingPostProcessor__BeanDefinitions.getConfigurationPropertiesBindingPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinder", ConfigurationPropertiesBinder__BeanDefinitions.ConfigurationPropertiesBinderFactory.getInternalConfigurationPropertiesBinderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.BoundConfigurationProperties", BoundConfigurationProperties__BeanDefinitions.getBoundConfigurationPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter", MethodValidationExcludeFilter__BeanDefinitions.getMethodValidationExcludeFilterBeanDefinition());
    beanFactory.registerBeanDefinition("spring.reactor.netty-org.springframework.boot.autoconfigure.reactor.netty.ReactorNettyProperties", ReactorNettyProperties__BeanDefinitions.getReactorNettyPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryConfiguration$EmbeddedNetty", ReactiveWebServerFactoryConfiguration__BeanDefinitions.EmbeddedNetty.getEmbeddedNettyBeanDefinition());
    beanFactory.registerBeanDefinition("nettyReactiveWebServerFactory", ReactiveWebServerFactoryConfiguration__BeanDefinitions.EmbeddedNetty.getNettyReactiveWebServerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration", ReactiveWebServerFactoryAutoConfiguration__BeanDefinitions.getReactiveWebServerFactoryAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("reactiveWebServerFactoryCustomizer", ReactiveWebServerFactoryAutoConfiguration__BeanDefinitions.getReactiveWebServerFactoryCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("server-org.springframework.boot.autoconfigure.web.ServerProperties", ServerProperties__BeanDefinitions.getServerPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("webServerFactoryCustomizerBeanPostProcessor", WebServerFactoryCustomizerBeanPostProcessor__BeanDefinitions.getWebServerFactoryCustomizerBeanPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$Jackson2ObjectMapperBuilderCustomizerConfiguration", JacksonAutoConfiguration__BeanDefinitions.Jackson2ObjectMapperBuilderCustomizerConfiguration.getJacksonObjectMapperBuilderCustomizerConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("standardJacksonObjectMapperBuilderCustomizer", JacksonAutoConfiguration__BeanDefinitions.Jackson2ObjectMapperBuilderCustomizerConfiguration.getStandardJacksonObjectMapperBuilderCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties", JacksonProperties__BeanDefinitions.getJacksonPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperBuilderConfiguration", JacksonAutoConfiguration__BeanDefinitions.JacksonObjectMapperBuilderConfiguration.getJacksonObjectMapperBuilderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jacksonObjectMapperBuilder", JacksonAutoConfiguration__BeanDefinitions.JacksonObjectMapperBuilderConfiguration.getJacksonObjectMapperBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$ParameterNamesModuleConfiguration", JacksonAutoConfiguration__BeanDefinitions.ParameterNamesModuleConfiguration.getParameterNamesModuleConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("parameterNamesModule", JacksonAutoConfiguration__BeanDefinitions.ParameterNamesModuleConfiguration.getParameterNamesModuleBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperConfiguration", JacksonAutoConfiguration__BeanDefinitions.JacksonObjectMapperConfiguration.getJacksonObjectMapperConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jacksonObjectMapper", JacksonAutoConfiguration__BeanDefinitions.JacksonObjectMapperConfiguration.getJacksonObjectMapperBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonMixinConfiguration", JacksonAutoConfiguration__BeanDefinitions.JacksonMixinConfiguration.getJacksonMixinConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jsonMixinModuleEntries", JacksonAutoConfiguration__BeanDefinitions.JacksonMixinConfiguration.getJsonMixinModuleEntriesBeanDefinition());
    beanFactory.registerBeanDefinition("jsonMixinModule", JacksonAutoConfiguration__BeanDefinitions.JacksonMixinConfiguration.getJsonMixinModuleBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration", JacksonAutoConfiguration__BeanDefinitions.getJacksonAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jsonComponentModule", JacksonAutoConfiguration__BeanDefinitions.getJsonComponentModuleBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration$DefaultCodecsConfiguration", CodecsAutoConfiguration__BeanDefinitions.DefaultCodecsConfiguration.getDefaultCodecsConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("defaultCodecCustomizer", CodecsAutoConfiguration__BeanDefinitions.DefaultCodecsConfiguration.getDefaultCodecCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration$JacksonCodecConfiguration", CodecsAutoConfiguration__BeanDefinitions.JacksonCodecConfiguration.getJacksonCodecConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jacksonCodecCustomizer", CodecsAutoConfiguration__BeanDefinitions.JacksonCodecConfiguration.getJacksonCodecCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration", CodecsAutoConfiguration__BeanDefinitions.getCodecsAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.codec-org.springframework.boot.autoconfigure.codec.CodecProperties", CodecProperties__BeanDefinitions.getCodecPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.ReactiveMultipartAutoConfiguration", ReactiveMultipartAutoConfiguration__BeanDefinitions.getReactiveMultipartAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("defaultPartHttpMessageReaderCustomizer", ReactiveMultipartAutoConfiguration__BeanDefinitions.getDefaultPartHttpMessageReaderCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("spring.webflux.multipart-org.springframework.boot.autoconfigure.web.reactive.ReactiveMultipartProperties", ReactiveMultipartProperties__BeanDefinitions.getReactiveMultipartPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.WebSessionIdResolverAutoConfiguration", WebSessionIdResolverAutoConfiguration__BeanDefinitions.getWebSessionIdResolverAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("webSessionIdResolver", WebSessionIdResolverAutoConfiguration__BeanDefinitions.getWebSessionIdResolverBeanDefinition());
    beanFactory.registerBeanDefinition("spring.webflux-org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties", WebFluxProperties__BeanDefinitions.getWebFluxPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.error.ErrorWebFluxAutoConfiguration", ErrorWebFluxAutoConfiguration__BeanDefinitions.getErrorWebFluxAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("errorWebExceptionHandler", ErrorWebFluxAutoConfiguration__BeanDefinitions.getErrorWebExceptionHandlerBeanDefinition());
    beanFactory.registerBeanDefinition("errorAttributes", ErrorWebFluxAutoConfiguration__BeanDefinitions.getErrorAttributesBeanDefinition());
    beanFactory.registerBeanDefinition("spring.web-org.springframework.boot.autoconfigure.web.WebProperties", WebProperties__BeanDefinitions.getWebPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration$EnableWebFluxConfiguration", WebFluxAutoConfiguration__BeanDefinitions.EnableWebFluxConfiguration.getEnableWebFluxConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("webFluxConversionService", WebFluxAutoConfiguration__BeanDefinitions.EnableWebFluxConfiguration.getWebFluxConversionServiceBeanDefinition());
    beanFactory.registerBeanDefinition("webFluxValidator", WebFluxAutoConfiguration__BeanDefinitions.EnableWebFluxConfiguration.getWebFluxValidatorBeanDefinition());
    beanFactory.registerBeanDefinition("localeContextResolver", WebFluxAutoConfiguration__BeanDefinitions.EnableWebFluxConfiguration.getLocaleContextResolverBeanDefinition());
    beanFactory.registerBeanDefinition("webSessionManager", WebFluxAutoConfiguration__BeanDefinitions.EnableWebFluxConfiguration.getWebSessionManagerBeanDefinition());
    beanFactory.registerBeanDefinition("webHandler", WebFluxConfigurationSupport__BeanDefinitions.getWebHandlerBeanDefinition());
    beanFactory.registerBeanDefinition("responseStatusExceptionHandler", WebFluxConfigurationSupport__BeanDefinitions.getResponseStatusExceptionHandlerBeanDefinition());
    beanFactory.registerBeanDefinition("requestMappingHandlerMapping", WebFluxConfigurationSupport__BeanDefinitions.getRequestMappingHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("webFluxContentTypeResolver", WebFluxConfigurationSupport__BeanDefinitions.getWebFluxContentTypeResolverBeanDefinition());
    beanFactory.registerBeanDefinition("routerFunctionMapping", WebFluxConfigurationSupport__BeanDefinitions.getRouterFunctionMappingBeanDefinition());
    beanFactory.registerBeanDefinition("resourceHandlerMapping", WebFluxConfigurationSupport__BeanDefinitions.getResourceHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("resourceUrlProvider", WebFluxConfigurationSupport__BeanDefinitions.getResourceUrlProviderBeanDefinition());
    beanFactory.registerBeanDefinition("requestMappingHandlerAdapter", WebFluxConfigurationSupport__BeanDefinitions.getRequestMappingHandlerAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("serverCodecConfigurer", WebFluxConfigurationSupport__BeanDefinitions.getServerCodecConfigurerBeanDefinition());
    beanFactory.registerBeanDefinition("webFluxAdapterRegistry", WebFluxConfigurationSupport__BeanDefinitions.getWebFluxAdapterRegistryBeanDefinition());
    beanFactory.registerBeanDefinition("handlerFunctionAdapter", WebFluxConfigurationSupport__BeanDefinitions.getHandlerFunctionAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("simpleHandlerAdapter", WebFluxConfigurationSupport__BeanDefinitions.getSimpleHandlerAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("webFluxWebSocketHandlerAdapter", WebFluxConfigurationSupport__BeanDefinitions.getWebFluxWebSocketHandlerAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("responseEntityResultHandler", WebFluxConfigurationSupport__BeanDefinitions.getResponseEntityResultHandlerBeanDefinition());
    beanFactory.registerBeanDefinition("responseBodyResultHandler", WebFluxConfigurationSupport__BeanDefinitions.getResponseBodyResultHandlerBeanDefinition());
    beanFactory.registerBeanDefinition("viewResolutionResultHandler", WebFluxConfigurationSupport__BeanDefinitions.getViewResolutionResultHandlerBeanDefinition());
    beanFactory.registerBeanDefinition("serverResponseResultHandler", WebFluxConfigurationSupport__BeanDefinitions.getServerResponseResultHandlerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration$WebFluxConfig", WebFluxAutoConfiguration__BeanDefinitions.WebFluxConfig.getWebFluxConfigBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration$WelcomePageConfiguration", WebFluxAutoConfiguration__BeanDefinitions.WelcomePageConfiguration.getWelcomePageConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("welcomePageRouterFunctionMapping", WebFluxAutoConfiguration__BeanDefinitions.WelcomePageConfiguration.getWelcomePageRouterFunctionMappingBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration", WebFluxAutoConfiguration__BeanDefinitions.getWebFluxAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration$AnnotationConfig", HttpHandlerAutoConfiguration__BeanDefinitions.AnnotationConfig.getAnnotationConfigBeanDefinition());
    beanFactory.registerBeanDefinition("httpHandler", HttpHandlerAutoConfiguration__BeanDefinitions.AnnotationConfig.getHttpHandlerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration", HttpHandlerAutoConfiguration__BeanDefinitions.getHttpHandlerAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration", AopAutoConfiguration__BeanDefinitions.ClassProxyingConfiguration.getClassProxyingConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("forceAutoProxyCreatorToUseClassProxying", AopAutoConfiguration__BeanDefinitions.ClassProxyingConfiguration.getForceAutoProxyCreatorToUseClassProxyingBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.aop.AopAutoConfiguration", AopAutoConfiguration__BeanDefinitions.getAopAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration", ApplicationAvailabilityAutoConfiguration__BeanDefinitions.getApplicationAvailabilityAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("applicationAvailability", ApplicationAvailabilityAutoConfiguration__BeanDefinitions.getApplicationAvailabilityBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration", ConfigurationPropertiesAutoConfiguration__BeanDefinitions.getConfigurationPropertiesAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration", LifecycleAutoConfiguration__BeanDefinitions.getLifecycleAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("lifecycleProcessor", LifecycleAutoConfiguration__BeanDefinitions.getLifecycleProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties", LifecycleProperties__BeanDefinitions.getLifecyclePropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration", ProjectInfoAutoConfiguration__BeanDefinitions.getProjectInfoAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties", ProjectInfoProperties__BeanDefinitions.getProjectInfoPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.netty.NettyAutoConfiguration", NettyAutoConfiguration__BeanDefinitions.getNettyAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.netty-org.springframework.boot.autoconfigure.netty.NettyProperties", NettyProperties__BeanDefinitions.getNettyPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration", SqlInitializationAutoConfiguration__BeanDefinitions.getSqlInitializationAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties", SqlInitializationProperties__BeanDefinitions.getSqlInitializationPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor", DatabaseInitializationDependencyConfigurer__BeanDefinitions.DependsOnDatabaseInitializationPostProcessor.getDependsOnDatabaseInitializationPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration", SslAutoConfiguration__BeanDefinitions.getSslAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("sslPropertiesSslBundleRegistrar", SslAutoConfiguration__BeanDefinitions.getSslPropertiesSslBundleRegistrarBeanDefinition());
    beanFactory.registerBeanDefinition("sslBundleRegistry", SslAutoConfiguration__BeanDefinitions.getSslBundleRegistryBeanDefinition());
    beanFactory.registerBeanDefinition("spring.ssl-org.springframework.boot.autoconfigure.ssl.SslProperties", SslProperties__BeanDefinitions.getSslPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration", TaskExecutionAutoConfiguration__BeanDefinitions.getTaskExecutionAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("taskExecutorBuilder", TaskExecutionAutoConfiguration__BeanDefinitions.getTaskExecutorBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("applicationTaskExecutor", TaskExecutionAutoConfiguration__BeanDefinitions.getApplicationTaskExecutorBeanDefinition());
    beanFactory.registerBeanDefinition("spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties", TaskExecutionProperties__BeanDefinitions.getTaskExecutionPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration", TaskSchedulingAutoConfiguration__BeanDefinitions.getTaskSchedulingAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("taskSchedulerBuilder", TaskSchedulingAutoConfiguration__BeanDefinitions.getTaskSchedulerBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties", TaskSchedulingProperties__BeanDefinitions.getTaskSchedulingPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration$NettyWebServerFactoryCustomizerConfiguration", EmbeddedWebServerFactoryCustomizerAutoConfiguration__BeanDefinitions.NettyWebServerFactoryCustomizerConfiguration.getNettyWebServerFactoryCustomizerConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("nettyWebServerFactoryCustomizer", EmbeddedWebServerFactoryCustomizerAutoConfiguration__BeanDefinitions.NettyWebServerFactoryCustomizerConfiguration.getNettyWebServerFactoryCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration", EmbeddedWebServerFactoryCustomizerAutoConfiguration__BeanDefinitions.getEmbeddedWebServerFactoryCustomizerAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.function.client.ClientHttpConnectorFactoryConfiguration$ReactorNetty", ClientHttpConnectorFactoryConfiguration__BeanDefinitions.ReactorNetty.getReactorNettyBeanDefinition());
    beanFactory.registerBeanDefinition("reactorClientHttpConnectorFactory", ClientHttpConnectorFactoryConfiguration__BeanDefinitions.ReactorNetty.getReactorClientHttpConnectorFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.function.client.ClientHttpConnectorAutoConfiguration", ClientHttpConnectorAutoConfiguration__BeanDefinitions.getClientHttpConnectorAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("webClientHttpConnector", ClientHttpConnectorAutoConfiguration__BeanDefinitions.getWebClientHttpConnectorBeanDefinition());
    beanFactory.registerBeanDefinition("webClientHttpConnectorCustomizer", ClientHttpConnectorAutoConfiguration__BeanDefinitions.getWebClientHttpConnectorCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration$WebClientCodecsConfiguration", WebClientAutoConfiguration__BeanDefinitions.WebClientCodecsConfiguration.getWebClientCodecsConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("exchangeStrategiesCustomizer", WebClientAutoConfiguration__BeanDefinitions.WebClientCodecsConfiguration.getExchangeStrategiesCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration", WebClientAutoConfiguration__BeanDefinitions.getWebClientAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("webClientBuilder", WebClientAutoConfiguration__BeanDefinitions.getWebClientBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("webClientSsl", WebClientAutoConfiguration__BeanDefinitions.getWebClientSslBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.aop.config.internalAutoProxyCreator", InfrastructureAdvisorAutoProxyCreator__BeanDefinitions.getInternalAutoProxyCreatorBeanDefinition());
  }

  /**
   * Register the aliases.
   */
  public void registerAliases(DefaultListableBeanFactory beanFactory) {
    beanFactory.registerAlias("applicationTaskExecutor", "taskExecutor");
  }
}
