package yarnwrap.network.handler;
public class EncoderHandler { public net.minecraft.network.handler.EncoderHandler wrapperContained; public EncoderHandler(net.minecraft.network.handler.EncoderHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.network.NetworkState state() { return new yarnwrap.network.NetworkState(wrapperContained.state); }

}