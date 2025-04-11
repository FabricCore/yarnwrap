package yarnwrap.network.handler;
public class DecoderHandler { public net.minecraft.network.handler.DecoderHandler wrapperContained; public DecoderHandler(net.minecraft.network.handler.DecoderHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.network.NetworkState state() { return new yarnwrap.network.NetworkState(wrapperContained.state); }
// public void state(yarnwrap.network.NetworkState value) { wrapperContained.state = value.wrapperContained; }

}