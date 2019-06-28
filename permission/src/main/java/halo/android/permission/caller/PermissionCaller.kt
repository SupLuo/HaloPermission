/*
 * Copyright (C) 2019 Lucio
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package halo.android.permission.caller

import android.content.Intent
import halo.android.permission.processor.PermissionResponder
import halo.android.permission.setting.SettingResponder

/**
 * Created by Lucio on 2019/6/22.
 */

interface PermissionCaller {

    /**
     * @param responder 回调
     * @param permissions 权限
     */
    fun requestPermission(responder: PermissionResponder, vararg permissions: String)

    fun requestPermissionSetting(responder: SettingResponder,intent: Intent)

}