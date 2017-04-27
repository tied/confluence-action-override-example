package example.app.actions;

import com.atlassian.confluence.pages.actions.AttachFileAction;

public class AttachFileBlockingAction extends AttachFileAction
{
 private static final long serialVersionUID = -1388129911796010207L;
 private String ERROR_MESSAGE = "Uploads are blocked on this confluence instance";
 
 public void validate() {
     super.validate();
     this.addActionError(ERROR_MESSAGE);
 }
 
}
