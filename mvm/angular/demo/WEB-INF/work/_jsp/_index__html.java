/*
 * JSP generated by Resin-3.0.22 (built Mon, 13 Nov 2006 09:32:38 PST)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _index__html extends com.caucho.jsp.JavaPage{
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    com.caucho.server.webapp.Application _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = com.caucho.jsp.QJspFactory.allocatePageContext(this, _jsp_application, request, response, null, null, 8192, true, false);
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      com.caucho.jsp.QJspFactory.freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.make.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.util.CauchoSystem.getVersionId() != -3988812337524854005L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.make.Dependency depend;
      depend = (com.caucho.make.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    long lastModified = 0;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      Object oDepend = _caucho_depends.get(i);
      if (oDepend instanceof com.caucho.vfs.Depend) {
        com.caucho.vfs.Depend depend = (com.caucho.vfs.Depend) oDepend;
        if (lastModified < depend.getLastModified())
          lastModified = depend.getLastModified();
      }
    }

    return lastModified;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("index.html"), 1025210885592756503L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  static {
    _jsp_string0 = "<!DOCTYPE html>\r\n<html ng-app=\"worldApp\">\r\n<head>\r\n	<meta charset=\"UTF-8\">\r\n	<title>{{query}}</title><!-- \u00e6\u0095\u00b0\u00e6\u008d\u00ae\u00e6\u00a8\u00a1\u00e5\u009e\u008b\u00e8\u00b7\u009f\u00e7\u009d\u0080control\u00e4\u00bd\u009c\u00e7\u0094\u00a8\u00e5\u009f\u009f\u00e8\u00b5\u00b0\u00ef\u00bc\u008c\u00e5\u00a6\u0082\u00e6\u009e\u009cng-model\u00e8\u00b7\u0091\u00e5\u0088\u00b0\u00e5\u0085\u00b6\u00e4\u00bb\u0096ctrl\u00e5\u008e\u00bb\u00e7\u009a\u0084\u00e8\u00af\u009d\u00ef\u00bc\u008c\u00e8\u00bf\u0099\u00e9\u0087\u008c\u00e5\u00b0\u00b1\u00e8\u008e\u00b7\u00e5\u008f\u0096\u00e4\u00b8\u008d\u00e5\u0088\u00b0\u00e4\u00ba\u0086 -->\r\n</head>\r\n<body>\r\n	<p><input type=\"text\" ng-model=\"world\"><br>Hello {{world}}!\r\n	</p>\r\n	<script src=\"../lib/angular.js\"></script>\r\n	<p>Search: <input ng-model=\"query\"></p>\r\n	<select ng-model=\"orderProp\">\r\n	  <option value=\"name\">name</option>\r\n	  <option value=\"age\">age</option>\r\n	</select>\r\n\r\n	<ul ng-controller=\"MemberCtrl\">\r\n		<li ng-repeat=\"person in members | filter:query | orderBy:orderProp\">\r\n			{{person.name}}\r\n			<p>{{person.info}}</p>\r\n		</li>\r\n	</ul>\r\n	<ul ng-controller=\"dataCtrl\">\r\n		<li ng-repeat=\"person in members | filter:query | orderBy:orderProp\">\r\n			{{person.name}}\r\n			<p>{{person.info}}</p>\r\n		</li>\r\n	</ul>\r\n	<p ng-controller=\"linkCtrl\">\r\n		<a ng-repeat=\"one in links\" href=\"{{one.link}}\" target=\"{{one.target}}\">\r\n			{{one.desc}}\r\n		</a>\r\n		<br>\r\n	</p>\r\n	<script src=\"js/app.js\"></script>\r\n</body>\r\n</html>".toCharArray();
  }
}
