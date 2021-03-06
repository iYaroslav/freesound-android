/*
 * Copyright 2016 Futurice GmbH
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

package com.futurice.freesound.app;

import com.futurice.freesound.feature.analytics.AnalyticsModule;
import com.futurice.freesound.feature.common.scheduling.SchedulingModule;
import com.futurice.freesound.feature.images.ImagesModule;
import com.futurice.freesound.feature.logging.LoggingModule;
import com.futurice.freesound.inject.app.BaseApplicationModule;
import com.futurice.freesound.network.api.ApiModule;

import dagger.Module;

@Module(includes = {BaseApplicationModule.class,
                    ApiModule.class,
                    ImagesModule.class,
                    SchedulingModule.class,
                    AnalyticsModule.class,
                    LoggingModule.class})
final class FreesoundApplicationModule {
}
