package com.shehabic.android.autoparcel.model;

/*
 * Copyright (C) 03/05/17 shehabic
 * Copyright (C) 13/07/16 aitorvs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.os.Parcelable;

import com.shehabic.autoparcel.AutoParcelMap;

import java.util.ArrayList;
import java.util.List;

@AutoParcelMap(map = ApiPerson.class, finalName = "FDPerson")
public abstract class MapPerson implements Parcelable {

    List<String> property = new ArrayList<>();

    void map(FDPerson person) {
        property.add(person.lastName);
        property.add(person.name);
        property.add(person.birthday.toString());
        property.add(String.valueOf(person.age));
    }
}
