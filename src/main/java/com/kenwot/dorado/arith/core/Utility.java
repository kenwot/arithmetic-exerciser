/*
 * Copyright 2023 the original author or authors.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kenwot.dorado.arith.core;

import java.util.concurrent.ThreadLocalRandom;

/**
 * <p>
 *     TODO-Kenown Utility
 * </p>
 *
 * @author Kenown
 * @since 0.0.1
 */
public class Utility {

    public static void main(String[] args) {
        int min = -100;
        int max = -10;
        for (int i = 0; i < 1000; i++) {
            int n = randomInt(min, max);
            if (n == min || n == max) {
                System.out.println("============== " + n);
            } else {
                System.out.println(n);
            }
        }
    }

    /** 随机生成一个指定范围内的整数，范围 [min, max] 包含上下限 */
    public static int randomInt(int min, int max) {
        return min + (int) (ThreadLocalRandom.current().nextDouble() * (max - min + 1));
    }

}
