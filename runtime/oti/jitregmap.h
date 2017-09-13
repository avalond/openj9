/*******************************************************************************
 * Copyright (c) 1991, 2016 IBM Corp. and others
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

#ifndef JITREGMAP_H
#define JITREGMAP_H

#ifdef __cplusplus
extern "C" {
#endif

#include "j9comp.h"

/* MethodMetaData.h defines this unnecessarily, just undo it here */
#undef jitCalleeSavedRegisterList

extern char * jitRegisterNames[];
extern U_8 jitCalleeDestroyedRegisterList[];
extern U_8 jitCalleeSavedRegisterList[];

#ifdef __cplusplus
}
#endif

#endif /* JITREGMAP_H */