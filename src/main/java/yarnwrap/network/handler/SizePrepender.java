package yarnwrap.network.handler;
public class SizePrepender { public net.minecraft.network.handler.SizePrepender wrapperContained; public SizePrepender(net.minecraft.network.handler.SizePrepender wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_PREPEND_LENGTH() { return wrapperContained.MAX_PREPEND_LENGTH; }
// public void MAX_PREPEND_LENGTH(int value) { wrapperContained.MAX_PREPEND_LENGTH = value; }

}