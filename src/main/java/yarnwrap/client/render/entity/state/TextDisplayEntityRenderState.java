package yarnwrap.client.render.entity.state;
public class TextDisplayEntityRenderState { public net.minecraft.client.render.entity.state.TextDisplayEntityRenderState wrapperContained; public TextDisplayEntityRenderState(net.minecraft.client.render.entity.state.TextDisplayEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public Object data() { return wrapperContained.data; }
// public void data(Object value) { wrapperContained.data = value; }
// // public static Object data() { return net.minecraft.client.render.entity.state.TextDisplayEntityRenderState.data; }
// // public static void data(Object value, ) { net.minecraft.client.render.entity.state.TextDisplayEntityRenderState.data = value; }

public Object textLines() { return wrapperContained.textLines; }
// public void textLines(Object value) { wrapperContained.textLines = value; }
// // public static Object textLines() { return net.minecraft.client.render.entity.state.TextDisplayEntityRenderState.textLines; }
// // public static void textLines(Object value, ) { net.minecraft.client.render.entity.state.TextDisplayEntityRenderState.textLines = value; }


}