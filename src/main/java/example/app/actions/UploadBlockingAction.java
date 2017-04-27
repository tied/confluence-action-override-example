package example.app.actions;

import javax.servlet.http.HttpServletRequest;

import com.atlassian.confluence.core.ConfluenceActionSupport;
import com.opensymphony.webwork.ServletActionContext;
import com.opensymphony.webwork.interceptor.ServletRequestAware;

public class UploadBlockingAction extends ConfluenceActionSupport implements ServletRequestAware
{
	private static final long serialVersionUID = -2986321170663090901L;
	private HttpServletRequest httpServletRequest;
	private String ERROR_MESSAGE = "Uploads are blocked on this confluence instance";

	@Override
	public String execute() throws Exception {
		this.addActionError(ERROR_MESSAGE);
		ServletActionContext.getResponse().setStatus(500);
		return "error";
	}

	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.httpServletRequest = httpServletRequest;
	}


}
