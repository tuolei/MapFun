/*
 *   Copyright 2016, donlan(梁桂栋)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *   Email me: stonelavender@hotmail.com
 */

package dong.lan.avoscloud.bean;

import com.avos.avoscloud.AVClassName;
import com.avos.avoscloud.AVObject;

/**
 * Created by 梁桂栋 on 2017/4/12.
 * Email: 760625325@qq.com
 * Github: github.com/donlan
 */
@AVClassName("Favorite")
public class AVOFavorite extends AVObject {

    public AVOUser getOwner() {
        try {
            return getAVObject("owner",AVOUser.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setOwner(AVOUser user) {
        super.put("owner", user);
    }


    public void setFeed(AVOFeed feed) {
        put("feed", feed);
    }

    public AVOFeed getFeed() {
        try {
            return getAVObject("feed", AVOFeed.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
