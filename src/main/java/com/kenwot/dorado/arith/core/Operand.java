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

import com.sun.jdi.Value;

/**
 * <p>
 *     TODO-Kenown Operand
 * </p>
 *
 * @author Kenown
 * @since 0.0.1
 */
public class Operand {

    public static Operand ofInteger(int value) {
        return new Operand(Type.INTEGER, value, 1);
    }

    /** 操作数类型：INTEGER-整数, DECIMAL-小数, FRACTION-分数 */
    private Type type;

    /** 分子值，当为整数和小数时，分子值即数值，分母值为 1 */
    private Value numerator;

    /** 分母值，当为整数或小数时，分子值即数值，分母值为 1 */
    private Value denominator;

    public Operand(Type type, Value numerator, Value denominator) {
        this.type = type;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Operand(int value) {
        this.type = Type.INTEGER;
        this.numerator =
    }

    public Operand type(Type type) {
        this.type = type;
        return this;
    }

    public Operand numerator(Operand numerator) {

    }

    public boolean isInteger() {
        return this.type == Type.INTEGER;
    }

    public boolean isDecimal() {
        return this.type == Type.DECIMAL;
    }

    public boolean isFraction() {
        return this.type == Type.FRACTION;
    }

    public enum Type {
        INTEGER, DECIMAL, FRACTION
    }

    public static class Value {
        public static Value of(int value) {
        }
        private Number numerator;
        private Number denominator;
    }

}
