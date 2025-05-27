package Visitor;

import gen.ComponentParser;

public interface MethodDel {
    Object visitMethodDecl(ComponentParser.MethodDeclContext ctx);
}
