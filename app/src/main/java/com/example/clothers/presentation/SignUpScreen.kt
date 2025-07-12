package com.example.clothers.presentation

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clothers.R
import com.example.clothers.presentation.utils.CustomTextField

@Preview(showSystemUi = true)

@Composable
fun SignUpScreen() {
    val context = LocalContext.current
    var firstName = remember { mutableStateOf("") }
    var lastName = remember { mutableStateOf("") }
    var email = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    var confirmPassword = remember { mutableStateOf("") }
    var phoneNumber = remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Text("SignUp", fontSize = 24.sp, style = TextStyle(fontWeight = FontWeight.Bold),
            modifier = Modifier
                .padding(vertical = 16.dp)
                .align(Alignment.Start))
        CustomTextField(
            value = firstName.value,
            onValueChange = { firstName.value = it },
            label = "First Name",
            leadingIcon = Icons.Default.Person,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
        )
        CustomTextField(
            value = lastName.value,
            onValueChange = { lastName.value = it },
            label = "Last Name",
            leadingIcon = Icons.Default.Person,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
        )
        CustomTextField(
            value = email.value,
            onValueChange = { email.value = it },
            label = "Email",
            leadingIcon = Icons.Default.Email,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
        )
        CustomTextField(
            value = phoneNumber.value,
            onValueChange = { phoneNumber.value = it },
            label = "Phone Number",
            leadingIcon = Icons.Default.Phone,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
        )

        CustomTextField(
            value = password.value,
            onValueChange = { password.value = it },
            label = "Password",
            leadingIcon = Icons.Default.Lock,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            visualTransformation = PasswordVisualTransformation()

        )
        CustomTextField(
            value = confirmPassword.value,
            onValueChange = { confirmPassword.value = it },
            label = "Confirm Password",
            leadingIcon = Icons.Default.Lock,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            visualTransformation = PasswordVisualTransformation()
        )
        Button(onClick = {
            if (firstName.value.isNotEmpty()&&lastName.value.isNotEmpty()&&
                email.value.isNotEmpty()&&password.value.isNotEmpty()&&
                confirmPassword.value.isNotEmpty()&&phoneNumber.value.isNotEmpty()){
                if (password==confirmPassword){
                    Toast.makeText(context, "SignUp Successfully", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(context, "Password and Confirm Password does not match", Toast.LENGTH_SHORT).show()
                }
            }
            else{
                Toast.makeText(context, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            }
        }, modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id= R.color.orange))
        ){
            Text("SignUp",color = colorResource(id = R.color.white))

        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Already have an account?")
            TextButton(onClick = {}) {
                Text("Login", color = colorResource(id = R.color.orange))
            }
        }
        Row(modifier = Modifier.fillMaxWidth().padding(8.dp),
            verticalAlignment = Alignment.CenterVertically) {
            HorizontalDivider(modifier = Modifier.weight(1f))
            Text("OR", modifier = Modifier.padding(horizontal = 8.dp))
            HorizontalDivider(modifier = Modifier.weight(1f))

        }
        OutlinedButton(onClick = {},
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
            shape = RoundedCornerShape(8.dp)) {
            Image(painter = painterResource(id = R.drawable.img), contentDescription = null,
                Modifier.size(24.dp))
            Spacer(modifier = Modifier.size(8.dp))
            Text("Login with Google")
        }

    }


}