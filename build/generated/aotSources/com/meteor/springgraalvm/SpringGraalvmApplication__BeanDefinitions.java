package com.meteor.springgraalvm;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link SpringGraalvmApplication}.
 */
public class SpringGraalvmApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'springGraalvmApplication'.
   */
  public static BeanDefinition getSpringGraalvmApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringGraalvmApplication.class);
    beanDefinition.setTargetType(SpringGraalvmApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(SpringGraalvmApplication.class);
    beanDefinition.setInstanceSupplier(SpringGraalvmApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
