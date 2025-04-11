package yarnwrap.server.dedicated;
public class EulaReader { public net.minecraft.server.dedicated.EulaReader wrapperContained; public EulaReader(net.minecraft.server.dedicated.EulaReader wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean eulaAgreedTo() { return wrapperContained.eulaAgreedTo; }
// public void eulaAgreedTo(boolean value) { wrapperContained.eulaAgreedTo = value; }
// public java.nio.file.Path eulaFile() { return wrapperContained.eulaFile; }
// public void eulaFile(java.nio.file.Path value) { wrapperContained.eulaFile = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public boolean isEulaAgreedTo() { return wrapperContained.isEulaAgreedTo(); }
// public boolean checkEulaAgreement() { return wrapperContained.checkEulaAgreement(); }
// public void createEulaFile() { wrapperContained.createEulaFile(); }

}