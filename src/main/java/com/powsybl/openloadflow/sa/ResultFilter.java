/**
 * Copyright (c) 2026, RTE (http://www.rte-france.com)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * SPDX-License-Identifier: MPL-2.0
 */
package com.powsybl.openloadflow.sa;

import com.powsybl.openloadflow.network.LfBranch;

import java.util.function.Predicate;

record ResultFilter(Predicate<LfBranch> branch, Predicate<String> voltageLevel,
                    Predicate<String> threeWindingsTransformer) {

    static final ResultFilter ALL = new ResultFilter(branch -> true, id -> true, id -> true);
}
