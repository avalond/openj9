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
package jit.test.jitt.resolves;

import org.testng.annotations.Test;

@Test(groups = { "level.sanity","component.jit" })
public class UnresolvedStatic extends jit.test.jitt.Test {

	static int v;

	private static void tstbar(int a) {
		if (a == 23) {
			v = 3; // never executed, but forces non-empty method
		}
	}

	private static void tstFoo(int i) {
		if (i == 1) {
			UnresolvedStatic.tstbar(i);
		}
	}

	@Test
	public void testUnresolvedStatic() {
		for (int x = 0; x < sJitThreshold; x++) { // compile first method
			UnresolvedStatic.tstFoo(0);
		}
		// second method is unresolved
		for (int x = 0; x < sJitThreshold; x++) { // promote second method
			UnresolvedStatic.tstFoo(1);
		}
	}

}