/*******************************************************************************
 * Copyright (c) 2001, 2017 IBM Corp. and others
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * This Source Code may also be made available under the following
 * Secondary Licenses when the conditions for such availability set
 * forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
 * General Public License, version 2 with the GNU Classpath
 * Exception [1] and GNU General Public License, version 2 with the
 * OpenJDK Assembly Exception [2].
 *
 * [1] https://www.gnu.org/software/classpath/license.html
 * [2] http://openjdk.java.net/legal/assembly-exception.html
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *******************************************************************************/
package VMBench;

import java.io.PrintStream;

public class FibBench {
    static int fibonacci(int num) {
        if (num < 3) {
            return 1;
        }
        return (fibonacci(num - 1) + fibonacci(num - 2));
    }

    public static void main(String[] args) {
        int result = 0;
        int iterations = 10000;
        if (args.length > 0) {
            iterations = Integer.parseInt(args[0]);
        }
        System.out.println("Fibonacci: iterations = " + iterations);
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterations; ++i) {
            result = fibonacci(12);
        }
        long stop = System.currentTimeMillis();
        System.out.println("fibonacci(12) = " + result);
        System.out.println("done, time = " + (stop - start));
    }
}