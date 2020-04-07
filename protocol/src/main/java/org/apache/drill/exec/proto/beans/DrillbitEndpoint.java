/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from protobuf

package org.apache.drill.exec.proto.beans;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class DrillbitEndpoint implements Externalizable, Message<DrillbitEndpoint>, Schema<DrillbitEndpoint>
{
    public enum State implements com.dyuproject.protostuff.EnumLite<State>
    {
        STARTUP(0),
        ONLINE(1),
        QUIESCENT(2),
        OFFLINE(3);
        
        public final int number;
        
        private State (int number)
        {
            this.number = number;
        }
        
        public int getNumber()
        {
            return number;
        }
        
        public static State valueOf(int number)
        {
            switch(number) 
            {
                case 0: return STARTUP;
                case 1: return ONLINE;
                case 2: return QUIESCENT;
                case 3: return OFFLINE;
                default: return null;
            }
        }
    }


    public static Schema<DrillbitEndpoint> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static DrillbitEndpoint getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DrillbitEndpoint DEFAULT_INSTANCE = new DrillbitEndpoint();

    
    private String address;
    private int userPort;
    private int controlPort;
    private int dataPort;
    private Roles roles;
    private String version;
    private State state;
    private int httpPort;

    public DrillbitEndpoint()
    {
        
    }

    // getters and setters

    // address

    public String getAddress()
    {
        return address;
    }

    public DrillbitEndpoint setAddress(String address)
    {
        this.address = address;
        return this;
    }

    // userPort

    public int getUserPort()
    {
        return userPort;
    }

    public DrillbitEndpoint setUserPort(int userPort)
    {
        this.userPort = userPort;
        return this;
    }

    // controlPort

    public int getControlPort()
    {
        return controlPort;
    }

    public DrillbitEndpoint setControlPort(int controlPort)
    {
        this.controlPort = controlPort;
        return this;
    }

    // dataPort

    public int getDataPort()
    {
        return dataPort;
    }

    public DrillbitEndpoint setDataPort(int dataPort)
    {
        this.dataPort = dataPort;
        return this;
    }

    // roles

    public Roles getRoles()
    {
        return roles;
    }

    public DrillbitEndpoint setRoles(Roles roles)
    {
        this.roles = roles;
        return this;
    }

    // version

    public String getVersion()
    {
        return version;
    }

    public DrillbitEndpoint setVersion(String version)
    {
        this.version = version;
        return this;
    }

    // state

    public State getState()
    {
        return state == null ? State.STARTUP : state;
    }

    public DrillbitEndpoint setState(State state)
    {
        this.state = state;
        return this;
    }

    // httpPort

    public int getHttpPort()
    {
        return httpPort;
    }

    public DrillbitEndpoint setHttpPort(int httpPort)
    {
        this.httpPort = httpPort;
        return this;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<DrillbitEndpoint> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public DrillbitEndpoint newMessage()
    {
        return new DrillbitEndpoint();
    }

    public Class<DrillbitEndpoint> typeClass()
    {
        return DrillbitEndpoint.class;
    }

    public String messageName()
    {
        return DrillbitEndpoint.class.getSimpleName();
    }

    public String messageFullName()
    {
        return DrillbitEndpoint.class.getName();
    }

    public boolean isInitialized(DrillbitEndpoint message)
    {
        return true;
    }

    public void mergeFrom(Input input, DrillbitEndpoint message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.address = input.readString();
                    break;
                case 2:
                    message.userPort = input.readInt32();
                    break;
                case 3:
                    message.controlPort = input.readInt32();
                    break;
                case 4:
                    message.dataPort = input.readInt32();
                    break;
                case 5:
                    message.roles = input.mergeObject(message.roles, Roles.getSchema());
                    break;

                case 6:
                    message.version = input.readString();
                    break;
                case 7:
                    message.state = State.valueOf(input.readEnum());
                    break;
                case 8:
                    message.httpPort = input.readInt32();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, DrillbitEndpoint message) throws IOException
    {
        if(message.address != null)
            output.writeString(1, message.address, false);

        if(message.userPort != 0)
            output.writeInt32(2, message.userPort, false);

        if(message.controlPort != 0)
            output.writeInt32(3, message.controlPort, false);

        if(message.dataPort != 0)
            output.writeInt32(4, message.dataPort, false);

        if(message.roles != null)
             output.writeObject(5, message.roles, Roles.getSchema(), false);


        if(message.version != null)
            output.writeString(6, message.version, false);

        if(message.state != null)
             output.writeEnum(7, message.state.number, false);

        if(message.httpPort != 0)
            output.writeInt32(8, message.httpPort, false);
    }

    public String getFieldName(int number)
    {
        switch(number)
        {
            case 1: return "address";
            case 2: return "userPort";
            case 3: return "controlPort";
            case 4: return "dataPort";
            case 5: return "roles";
            case 6: return "version";
            case 7: return "state";
            case 8: return "httpPort";
            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {
        __fieldMap.put("address", 1);
        __fieldMap.put("userPort", 2);
        __fieldMap.put("controlPort", 3);
        __fieldMap.put("dataPort", 4);
        __fieldMap.put("roles", 5);
        __fieldMap.put("version", 6);
        __fieldMap.put("state", 7);
        __fieldMap.put("httpPort", 8);
    }
    
}