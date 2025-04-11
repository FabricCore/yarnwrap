package yarnwrap.client.gui.screen.narration;
public class NarrationMessageBuilder { public net.minecraft.client.gui.screen.narration.NarrationMessageBuilder wrapperContained; public NarrationMessageBuilder(net.minecraft.client.gui.screen.narration.NarrationMessageBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.gui.screen.narration.NarrationMessageBuilder nextMessage() { return new yarnwrap.client.gui.screen.narration.NarrationMessageBuilder(wrapperContained.nextMessage()); }
public void put(yarnwrap.client.gui.screen.narration.NarrationPart part,yarnwrap.client.gui.screen.narration.Narration narration) { wrapperContained.put(part.wrapperContained,narration.wrapperContained); }
public void put(yarnwrap.client.gui.screen.narration.NarrationPart part,java.lang.String string) { wrapperContained.put(part.wrapperContained,string); }
public void put(yarnwrap.client.gui.screen.narration.NarrationPart part,yarnwrap.text.Text text) { wrapperContained.put(part.wrapperContained,text.wrapperContained); }
public void put(yarnwrap.client.gui.screen.narration.NarrationPart part,net.minecraft.text.Text[] texts) { wrapperContained.put(part.wrapperContained,texts); }

}