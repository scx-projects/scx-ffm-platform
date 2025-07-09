package cool.scx.ffm.platform.win32;

import cool.scx.ffm.callback.Callback;
import cool.scx.ffm.struct.Struct;

import java.lang.foreign.MemorySegment;

public final class WinUser {

    /// EnumWindows 回调接口
    public interface WNDENUMPROC extends Callback {

        boolean callback(MemorySegment hwnd, long lParam);

    }

    public static class POINT implements Struct {
        public int x;
        public int y;
    }

}
