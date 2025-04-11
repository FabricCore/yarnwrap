package yarnwrap.network.state;
public class PlayStateFactories { public net.minecraft.network.state.PlayStateFactories wrapperContained; public PlayStateFactories(net.minecraft.network.state.PlayStateFactories wrapperContained) { this.wrapperContained = wrapperContained; }

public Object C2S() { return wrapperContained.C2S; }
// // public void C2S(Object value) { wrapperContained.C2S = value; }
public Object S2C() { return wrapperContained.S2C; }
// // public void S2C(Object value) { wrapperContained.S2C = value; }

}