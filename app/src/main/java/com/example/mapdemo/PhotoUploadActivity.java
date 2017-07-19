package com.example.mapdemo;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by amade002 on 7/18/17.
 */

public class PhotoUploadActivity extends AppCompatActivity {

//    ImageButton ibGalleryPic;
//
//    AlertDialog dialog;
//    private static final int IMAGE_PICK = 1;
//    private static final int IMAGE_CAPTURE = 2;
//    private Bitmap profile_imageBitmap;
//
//    if (v == ibGalleryPic) {
//        dialog.show();
//    }
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.markerdetails_activity);
//
//        final String[] items = new String[] { "Take from camera",
//                "Select from gallery" };
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.select_dialog_item, items);
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//
//        builder.setTitle("Select Image");
//        builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int item) {
//
//                if (item == 0) {
//                    path = "";
//                    Intent intent = new Intent(
//                            "android.media.action.IMAGE_CAPTURE");
//                    File folder = new File(Environment
//                            .getExternalStorageDirectory() + "/LoadImg");
//
//                    if (!folder.exists()) {
//                        folder.mkdir();
//                    }
//                    final Calendar c = Calendar.getInstance();
//                    String new_Date = c.get(Calendar.DAY_OF_MONTH) + "-"
//                            + ((c.get(Calendar.MONTH)) + 1) + "-"
//                            + c.get(Calendar.YEAR) + " " + c.get(Calendar.HOUR)
//                            + "-" + c.get(Calendar.MINUTE) + "-"
//                            + c.get(Calendar.SECOND);
//
//                    path = String.format(
//                            Environment.getExternalStorageDirectory()
//                                    + "/LoadImg/%s.png", "LoadImg(" + new_Date
//                                    + ")");
//                    File photo = new File(path);
//                    intent.putExtra(MediaStore.EXTRA_OUTPUT,
//                            Uri.fromFile(photo));
//                    startActivityForResult(intent, 2);
//
//                } else { // pick from file
//                    Intent intent = new Intent(
//                            Intent.ACTION_PICK,
//                            android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                    intent.setType("image/*");
//                    startActivityForResult(
//                            Intent.createChooser(intent, "Choose a Photo"),
//                            IMAGE_PICK);
//                }
//            }
//        });
//
//        dialog = builder.create();
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//
//        if (resultCode == Activity.RESULT_OK && requestCode == IMAGE_PICK
//                || requestCode == IMAGE_CAPTURE) {
//            switch (requestCode) {
//                case IMAGE_PICK:
//                    this.imageFromGallery(resultCode, data);
//
//                    img_myProfile.setImageBitmap(null);
//
//                    img_myProfile.setImageBitmap(setphoto);
//
//                    break;
//
//                case IMAGE_CAPTURE:
//
//                    this.imageFromGallery(resultCode, data);
//
//                    img_myProfile.setImageBitmap(null);
//
//                    img_myProfile.setImageBitmap(setphoto);
//
//                    break;
//                default:
//                    break;
//            }
//        }
//    }
//
//    private void imageFromGallery(int resultCode, Intent data) {
//        Uri selectedImage = data.getData();
//        String[] filePathColumn = { MediaStore.Images.Media.DATA };
//
//        Cursor cursor = getContentResolver().query(selectedImage,
//                filePathColumn, null, null, null);
//        cursor.moveToFirst();
//
//        int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
//
//        profile_Path = cursor.getString(columnIndex);
//        cursor.close();
//
//        setphoto = BitmapFactory.decodeFile(profile_Path);
//
//    }
//
//    private void imageFromCamera(int resultCode, Intent data) {
//        updateImageView((Bitmap) data.getExtras().get("data"));
//    }
//
//    private void updateImageView(Bitmap newImage) {
//        setphoto = newImage.copy(Bitmap.Config.ARGB_8888, true);
//    }
//
//    public String getPath(Uri uri) {
//        String[] projection = { MediaStore.Images.Media.DATA };
//        Cursor cursor = managedQuery(uri, projection, null, null, null);
//        int column_index = cursor
//                .getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
//        cursor.moveToFirst();
//        return cursor.getString(column_index);
//    }
}
