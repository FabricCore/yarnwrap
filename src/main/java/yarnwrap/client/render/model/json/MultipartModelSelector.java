package yarnwrap.client.render.model.json;
public class MultipartModelSelector { public net.minecraft.client.render.model.json.MultipartModelSelector wrapperContained; public MultipartModelSelector(net.minecraft.client.render.model.json.MultipartModelSelector wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.model.json.MultipartModelSelector TRUE() { return new yarnwrap.client.render.model.json.MultipartModelSelector(wrapperContained.TRUE); }
// public void TRUE(yarnwrap.client.render.model.json.MultipartModelSelector value) { wrapperContained.TRUE = value.wrapperContained; }
public yarnwrap.client.render.model.json.MultipartModelSelector FALSE() { return new yarnwrap.client.render.model.json.MultipartModelSelector(wrapperContained.FALSE); }
// public void FALSE(yarnwrap.client.render.model.json.MultipartModelSelector value) { wrapperContained.FALSE = value.wrapperContained; }

}