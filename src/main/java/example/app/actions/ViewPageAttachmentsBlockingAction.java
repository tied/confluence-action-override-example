package example.app.actions;


import java.util.ArrayList;
import java.util.Collection;

import com.atlassian.confluence.pages.actions.ViewPageAttachmentsAction;

public class ViewPageAttachmentsBlockingAction extends ViewPageAttachmentsAction
{

	private static final long serialVersionUID = 269519895111585067L;
	private String ERROR_MESSAGE = "Uploads are blocked on this confluence instance";

	public void validateUpload() {
		Collection<String> col = new ArrayList<String>();
		col.add(ERROR_MESSAGE);
		this.setActionErrors(col);
	}

}
