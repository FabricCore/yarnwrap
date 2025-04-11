package yarnwrap.server.network;
public class JoinWorldTask { public net.minecraft.server.network.JoinWorldTask wrapperContained; public JoinWorldTask(net.minecraft.server.network.JoinWorldTask wrapperContained) { this.wrapperContained = wrapperContained; }

public Object KEY() { return wrapperContained.KEY; }
// // public void KEY(Object value) { wrapperContained.KEY = value; }

}