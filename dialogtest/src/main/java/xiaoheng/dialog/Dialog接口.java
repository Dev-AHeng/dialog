package xiaoheng.dialog;

import android.app.*;
import android.content.*;

public class Dialog接口
{
	public static void 对话框(Context 上下文, String 标题, String 内容, String 第一个内容, String 第二个内容, final 按钮点击事件监听 it)
	{
		AlertDialog.Builder ad = new AlertDialog.Builder(上下文);
		ad.setTitle(标题);
		ad.setMessage(内容);
		ad.setPositiveButton(第一个内容, new DialogInterface.OnClickListener()
			{
				@Override
				public void onClick(DialogInterface p1, int p2)
				{
					// TODO: Implement this method
					it.第一个按钮点击事件(p1, p2);
				}
			});
		ad.setNegativeButton(第二个内容, new DialogInterface.OnClickListener()
			{
				@Override
				public void onClick(DialogInterface p1, int p2)
				{
					// TODO: Implement this method
					it.第二个按钮点击事件(p1, p2);
				}
			});
		ad.show();
	}

	public interface 按钮点击事件监听
	{
		void 第一个按钮点击事件(DialogInterface DialogInterface对象, int 不知道这参数有啥用);
		void 第二个按钮点击事件(DialogInterface DialogInterface对象, int 不知道这参数有啥用);
	}

}
