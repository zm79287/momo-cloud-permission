/**
 * Copyright (c) 2018-2019, Jie Li 李杰 (mqgnsds@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.momo.common.log;

import com.momo.common.log.aspect.SystemCoreLogAspect;
import com.momo.common.log.event.SystemCoreLogListener;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @ClassName: LogAutoConfiguration
 * @Author: Jie Li
 * @Date 2019-11-14 14:55
 * @Description: 自动配置类
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2019</p>
 **/
@EnableAsync
@Configuration
@AllArgsConstructor
@ConditionalOnWebApplication
public class LogAutoConfiguration {

    @Bean
    public SystemCoreLogListener sysLogListener() {
        return new SystemCoreLogListener();
    }

    @Bean
    public SystemCoreLogAspect sysLogAspect() {
        return new SystemCoreLogAspect();
    }
}
