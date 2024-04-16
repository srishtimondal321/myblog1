package com.blogapp1.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class PostDto {

    private long id;
    @NotEmpty
    @Size(min=3,message = "Title should be atleast 3 Characters")
    private String title;
    @NotEmpty
    @Size(min=3,message = "Description should be atleast 3 Characters")
    private String description;
    private String content;

    @Size(min = 10,max = 10, message = "Mobile number should be 10 digits")
    private String mobile;
}
