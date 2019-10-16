package com.joy.ad.index.adunit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by SongLiang on 2019-10-14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitConstants {

    public static class POSITION_TYPE {

        public static final int KAIPING = 1;

        public static final int TIEPIAN = 2;

        public static final int TIEPIAN_MIDDLE = 4;

        public static final int TIEPIAN_PAUSE = 8;

        public static final int TIEPIAN_POST = 16;

    }

}
