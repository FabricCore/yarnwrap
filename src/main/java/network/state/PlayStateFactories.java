package yarnwrap.network.state;
public class PlayStateFactories { public net.minecraft.network.state.PlayStateFactories wrapperContained; public PlayStateFactories(net.minecraft.network.state.PlayStateFactories wrapperContained) { this.wrapperContained = wrapperContained; }

public Object C2S() { return wrapperContained.C2S; }
public Object S2C() { return wrapperContained.S2C; }

}