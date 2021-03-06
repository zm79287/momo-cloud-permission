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
package com.momo.common.core.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName: LevelUtil
 * @Author: Jie Li
 * @Date 2019-11-14 14:39
 * @Description: 无限级递归树工具类
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2019</p>
 **/
public class LevelUtil {
    public final static String SEPARATOR = ".";
    public final static String ROOT = "0";

    //0
    //0.1
    //0.1.1
    //0.1.3
    //0.4


    public static String calculateLevel(String parentLevel, long parentId) {
        if (StringUtils.isBlank(parentLevel)) {
            return ROOT;
        } else {
            return StringUtils.join(parentLevel, SEPARATOR, parentId);
        }
    }

    public static String calculateLevelString(String parentLevel, long parentId) {
        if (StringUtils.isBlank(parentLevel)) {
            return ROOT;
        } else {
            return StringUtils.join(parentLevel, SEPARATOR, parentId);
        }
    }
}
