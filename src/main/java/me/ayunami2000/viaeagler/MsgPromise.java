package me.ayunami2000.viaeagler;

import io.netty.channel.ChannelPromise;

public class MsgPromise {
    public Object msg;
    public ChannelPromise promise;
    public MsgPromise(Object msg, ChannelPromise promise) {
        this.msg = msg;
        this.promise = promise;
    }
}
