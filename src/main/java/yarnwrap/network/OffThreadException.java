package yarnwrap.network;
public class OffThreadException { public net.minecraft.network.OffThreadException wrapperContained; public OffThreadException(net.minecraft.network.OffThreadException wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.OffThreadException INSTANCE() { return new yarnwrap.network.OffThreadException(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.network.OffThreadException value) { wrapperContained.INSTANCE = value.wrapperContained; }

}