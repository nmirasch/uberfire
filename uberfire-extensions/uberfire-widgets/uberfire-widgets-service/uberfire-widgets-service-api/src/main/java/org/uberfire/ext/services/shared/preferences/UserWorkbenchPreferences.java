/*
 * Copyright 2015 JBoss, by Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.uberfire.ext.services.shared.preferences;

import org.uberfire.preferences.shared.annotations.Property;
import org.uberfire.preferences.shared.annotations.WorkbenchPreference;
import org.uberfire.preferences.shared.bean.BasePreference;

@WorkbenchPreference(identifier = "UserWorkbenchPreferences")
public class UserWorkbenchPreferences implements BasePreference<UserWorkbenchPreferences> {
    @Property
    private String language;

    @Property
    private boolean useWorkbenchInCompactMode;

    @Override
    public UserWorkbenchPreferences defaultValue(final UserWorkbenchPreferences defaultValue) {
        defaultValue.useWorkbenchInCompactMode=false;
        return defaultValue;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public boolean isUseWorkbenchInCompactMode() {
        return useWorkbenchInCompactMode;
    }

    public void setUseWorkbenchInCompactMode(boolean useWorkbenchInCompactMode) {
        this.useWorkbenchInCompactMode = useWorkbenchInCompactMode;
    }
}
